import { useEffect, useState } from 'react'

const AppRoot = () => {
  const [data, setData] = useState({})

  useEffect(() => {
    //console.log('startup')
    fetch('/api/v1/devotionals/daily')
    .then(response => response.json())
    .then(json => {
      // console.log('data', json.data)
      setData(json.data)
    })

  }, [])

  return (
    <>
      <div className="container">
        <div className="row">
          <div className="col">
            <h1 className="text-center display-1">Daily Message</h1>
            <hr />
          </div>
        </div>
        <div className="row">
          <div className="col">
            <ul key={data.id}>
              <li><img className="img-fluid" src={data.imagePath} /></li>
              <li><p className="content-date">{data.publishedAt}</p></li>
              <li>
                <figure className="text-center">
                  <blockquote className="blockquote">
                    <p className="display-4">"{data.quote}"</p>
                  </blockquote>
                  <figcaption className="blockquote-footer">
                    <cite className="display-6" title={data.author}>{data.author}</cite>
                  </figcaption>
                </figure>
              </li>
              <li><p className="content">{data.content}</p></li>
            </ul>
            <hr />
          </div>
        </div>
      </div>
    </>
  )
}

export default AppRoot